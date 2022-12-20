package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {

		System.out.println("\n-------------------ColumbiaUniversity-----------------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		ColumbiaUniversity.mahmuda();
		columbiaUniversity.biology();// Here static method of ColumbiaUniversity class called by the class itself.
		columbiaUniversity.caring();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.lawInfo();
		columbiaUniversity.VocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.gymnasium();
		columbiaUniversity.anatomyLab();

		System.out.println("\n-------------University-------------- ");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library(); // Here static method of University Interface called by the Interface itself.
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();

		System.out.println("\n------------MedicalSchool-----------------\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();

	}

}
