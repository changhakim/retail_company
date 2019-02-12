package proxy;

import javax.servlet.http.HttpServletRequest;

import command.Receiver;
import lombok.Data;
import service.CustomerServiceImpl;

@Data
public class Pagination implements Capable{
	private String pageNum,pageSize,blockSize,
				   startRow,endRow,startpage,endpage,
				   prevBlock,nextBlock;
	private boolean existPrev,existNext;
	private int totalCount;
	@Override
	public void carryOut() {
		HttpServletRequest requst = Receiver.cmd.getRequest();
		System.out.println("페이지네이션"+requst.getParameter("page_num"));
		System.out.println("페이지네이션 페이지"+requst.getParameter("page"));
		this.pageNum =(requst.getParameter("page_num")==null)?"1":requst.getParameter("page_num");
		this.pageSize =(requst.getParameter("page_size")==null)?"5":requst.getParameter("page_size");
		int pageNum1 = Integer.parseInt(pageNum);
		int pageSize1 = Integer.parseInt(pageSize);
		this.totalCount = Integer.parseInt(CustomerServiceImpl.getInstance().countCustomers());
		this.startRow = String.valueOf(totalCount-((pageSize1*pageNum1)-1));
		this.endRow = String.valueOf(totalCount-((pageSize1*pageNum1)-1)+(pageSize1-1));
		System.out.println("");
		
	}
}
