package studyTeam.study.domain;

import java.util.Date;

public class StudyWeek {
	
	private String title;
	private String subject;
	private String startDate;
	private String endDate;
	private String outcome ;
	private String deepDrive;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getOutcome() {
		return outcome;
	}
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	public String getDeepDrive() {
		return deepDrive;
	}
	public void setDeepDrive(String deepDrive) {
		this.deepDrive = deepDrive;
	}
	@Override
	public String toString() {
		return "StudyWeek [title=" + title + ", subject=" + subject + ", startDate=" + startDate + ", endDate="
				+ endDate + ", outcome=" + outcome + ", deepDrive=" + deepDrive + "]";
	}
	
	
	
}
