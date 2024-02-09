package EmailGenerator;

public class Frontend {

	public static void main(String[] args) {
		fileReader read =new fileReader();
		for (int i = 0; i < fileReader.fnames.size(); i++) {
            String fname = fileReader.fnames.get(i);
            String lname = fileReader.lnames.get(i);

            // Instantiate the Backend class for each fname and lname
            Backend email = new Backend(fname, lname);
            System.out.println(email.showInfo());

			System.out.println();
        }

	}

}
