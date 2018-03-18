package guru.mrtu.taskcoach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    /*
    public static void main(String[] args) {

        Tasks tasks = new Tasks();
        Task task = new Task();

        task.setActualstartdate("2018-03-16 22:20:00");

        tasks.getTask().add(task);

        try {

            File file = new File("file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Tasks.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(tasks, file);
            jaxbMarshaller.marshal(tasks, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    */
}
