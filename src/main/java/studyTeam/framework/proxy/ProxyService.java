package studyTeam.framework.proxy;

public class ProxyService implements IProxyService {

	@Override
	public String Ilogic(String nm) {
		
		return "은행 전산" +nm;
	}

}
