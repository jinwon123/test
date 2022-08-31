package quiz01.quiz06;

import java.util.ArrayList;

public class BoardDao {
	
	public ArrayList<Board> getBoardList(){
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1", "제목1"));
		list.add(new Board("제목2", "제목2"));
		list.add(new Board("제목3", "제목3"));
		return list;
	}
	

}
