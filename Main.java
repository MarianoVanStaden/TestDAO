

public class Main {
    public static void main(String[] args) {

        System.out.println("Instanciando sin el DAO!");
        ModelPerson persona1 = new ModelPerson("43231248", "Martin", "Campos");
        System.out.println("Registro N°:" + persona1.getId() + " DNI: " + persona1.getDni());
        System.out.println("Hello "+ persona1.getfirstName()+ " " + persona1.getlastName());

        PersonDAO person = new PersonDAO();
        person.readAll();
        person.create(persona1);
        System.out.println(person.readById(1).getfirstName() + " fue encontrado por ID");


    }
}