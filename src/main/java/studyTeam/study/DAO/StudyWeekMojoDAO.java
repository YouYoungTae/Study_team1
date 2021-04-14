package studyTeam.study.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import studyTeam.study.domain.StudyWeek;




@Repository()
public class StudyWeekMojoDAO implements IstudyWeekMojoDAO {
	
	private static List<StudyWeek> dataList; 

	public StudyWeekMojoDAO() {
		if (dataList ==null) {
			dataList = new ArrayList<StudyWeek> ();

		}
	}
	
	/* (non-Javadoc)
	 * @see studyTeam.study.DAO.IstudyWeekMojoDAO#getList()
	 */
	@Override
	public List<StudyWeek> getList(){
		System.out.println(dataList.size());
		return dataList;
	}
}
