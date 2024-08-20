

public class Main {
    public static void main(String[] args) {

        //Instanciando sin el DAO!
        //Creamos un lote con tres personas usando el constructor sin id, para que el DAO utilice el constructor con id
        ModelPerson person1 = new ModelPerson("12345678", "Javier", "Milei");
        ModelPerson person2 = new ModelPerson("23456789", "Alberto", "Fernandez");
        ModelPerson person3 = new ModelPerson("34567890", "Mauricio", "Macri");
        
        //Instanciando con el DAO!
        PersonDAO people = new PersonDAO();

        //Creamos personas a través del DAO
        people.create(person1);
        people.create(person2);
        people.create(person3);

        //Leemos todas las personas
        System.out.println("Leemos todas las personas");
        for (ModelPerson person : people.readAll()) {
            System.out.println("Registro N°:" + person.getId() + " DNI: " + person.getDni());
            System.out.println("Hello "+ person.getfirstName()+ " " + person.getlastName());
        }
        System.out.println();

        //Leemos una persona por ID
        System.out.println("Leemos una persona por ID");
        System.out.println(people.readById(2).getfirstName() + " fue encontrado por ID(" + people.readById(2).getId() + ")");
        System.out.println();

        //Actualizamos una persona
        System.out.println("Actualizamos una persona en el ID 2");
        ModelPerson persona4 = new ModelPerson("45678901", "Cristina", "Kirchner");
        people.update(persona4, 2);
        System.out.println();

        //Leemos todas las personas
        System.out.println("Leemos todas las personas");
        for (ModelPerson person : people.readAll()) {
            System.out.println("Registro N°:" + person.getId() + " DNI: " + person.getDni());
            System.out.println("Hello "+ person.getfirstName()+ " " + person.getlastName());
        }
        System.out.println();

        //Eliminamos una persona
        System.out.println("Eliminamos una persona de ID 2");
        people.deleteById(2);
        System.out.println();

        //Leemos todas las personas
        System.out.println("Leemos todas las personas");
        for (ModelPerson person : people.readAll()) {
            System.out.println("Registro N°:" + person.getId() + " DNI: " + person.getDni());
            System.out.println("Hello "+ person.getfirstName()+ " " + person.getlastName());
        }



    }
}