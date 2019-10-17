package action.board;

import action.Action;

public class BoardFactory {
	public static Action getAction(String cmd) {
		if(cmd.equals("")) {
			return null;
		}else if(cmd.equals("list")) {
			return new BoardListAction();
		}else if(cmd.equals("detail")) {
			return new BoardDetailAction();
		}else if(cmd.equals("delete")) {
			return new BoardDeleteAction();
		}else if(cmd.equals("writeForm")) {
			return new BoardWriteFormAction();
		}else if(cmd.equals("write")) {
			return new BoardWriteAction();
		}
		return null;
	}
}
