package proxy;

import javax.servlet.http.HttpServletRequest;

import lombok.Data;
import service.CustomerServiceImpl;

@Data
public class Pagination implements Proxy{
	private int pageNum,pageSize,blockSize,
				   startRow,endRow,startpage,endpage,
				   prevBlock,nextBlock,totalCount;
	private boolean existPrev,existNext;
	 
	@Override
	public void carryOut(Object o) {
		HttpServletRequest requst = (HttpServletRequest)o;
		System.out.println("페이지네이션"+requst.getParameter("page_num"));
		System.out.println("페이지네이션 페이지"+requst.getParameter("page"));
		this.pageNum =(requst.getParameter("page_num")==null)?1:Integer.parseInt(requst.getParameter("page_num"));
		this.pageSize =(requst.getParameter("page_size")==null)?5:Integer.parseInt(requst.getParameter("page_size"));
		this.totalCount = Integer.parseInt(CustomerServiceImpl.getInstance().countCustomers(null));
		System.out.println("총갯수"+totalCount);
		
		
		
		/*this.startRow = totalCount-((pageSize*pageNum)-1);
		if(startRow<=0) {
			int a = totalCount % pageSize;
			startRow = 1;
		}*/
		/*this.endRow = (totalCount-((pageSize*pageNum))+pageSize);*/
		int pageCount = totalCount/pageSize;
		if(totalCount%pageSize!=0) {
			pageCount = pageCount++;
		}
		this.startRow = pageSize*(pageNum-1)+1;
		this.endRow = pageNum * pageSize;
		endRow = (totalCount > endRow)?endRow:totalCount;
		/*this.startRow =(totalCount-((pageSize*pageNum)-1)<=0)?1:totalCount-((pageSize*pageNum)-1);
		this.endRow = (totalCount-(pageSize*pageNum)+pageSize);*/
		
		this.blockSize =(requst.getParameter("blocksize")==null)?5:Integer.parseInt(requst.getParameter("blocksize"));
		
	}
}
