package proxy;

import javax.servlet.http.HttpServletRequest;

import enums.Action;
import lombok.Data;
import service.CustomerServiceImpl;
import service.ProductServiceImpl;

@Data
public class Pagination implements Proxy{
	private int pageNum,pageSize,blockSize,
				   startRow,endRow,startpage,endpage,
				   prevBlock,nextBlock,totalCount;
	private boolean existPrev,existNext;
	 
	@Override
	public void carryOut(Object o) {
		HttpServletRequest requst = (HttpServletRequest)o;
		System.out.println("cmd"+requst.getParameter("cmd"));
		System.out.println("페이지네이션 페이지"+requst.getParameter("page"));
		this.pageNum =(requst.getParameter("page_num")==null)?1:Integer.parseInt(requst.getParameter("page_num"));
		this.pageSize =(requst.getParameter("page_size")==null)?5:Integer.parseInt(requst.getParameter("page_size"));
		switch (Action.valueOf(requst.getParameter("cmd").toUpperCase())) {
		
		case CUST_LIST:case ACCESS:
			this.totalCount = Integer.parseInt(CustomerServiceImpl.getInstance().countCustomers(null));
			break;
		case PRODUCT_LIST:case PRODUCT_REGISTER:case PRODUCT_DELETE:case PRODUCT_UPDATE:
			this.totalCount = ProductServiceImpl.getInstance().countProducts(null);
			break;	
		default:
			break;
		}
		
		
		
		System.out.println("총갯수"+totalCount);
		
		
		
		
		/*this.startRow = totalCount-((pageSize*pageNum)-1);
		if(startRow<=0) {
			int a = totalCount % pageSize;
			startRow = 1;
		}*/
		/*this.endRow = (totalCount-((pageSize*pageNum))+pageSize);*/
		int pageCount = totalCount/pageSize;
		if(totalCount%pageSize!=0) {
			pageCount++;
		}
		this.startRow = pageSize*(pageNum-1)+1;
		this.endRow = pageNum * pageSize;
		endRow = (totalCount > endRow)?endRow:totalCount;
		this.blockSize =(requst.getParameter("blocksize")==null)?5:Integer.parseInt(requst.getParameter("blocksize"));
		
		
		this.existPrev = (pageNum<=blockSize)?false:true;
		
		startpage = ((pageNum-1)/blockSize)*blockSize+1;
		this.existNext = (startpage+pageSize)>=pageCount?false:true;
		endpage = startpage + 4;
		if(endpage>pageCount) {
			endpage = pageCount;
		
		}
		prevBlock = startpage - pageSize;
		nextBlock = startpage + pageSize;
		
	}
	}

