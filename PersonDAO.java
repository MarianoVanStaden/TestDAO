import java.util.ArrayList;

public class PersonDAO implements InterfaceDao<ModelPerson> {
    private ArrayList<ModelPerson> data = new ArrayList<>();
    private static int nextId = 1;

    
    @Override
    public void create(ModelPerson person) {
    if(person.getId() == 0) {
        person.setId(nextId++);
        this.data.add(person);
    }
    }

    @Override
    public ModelPerson readById(int id) {
        for (int i= 0; i<data.size(); i++){
            ModelPerson currentPerson = data.get(i);
            if(currentPerson.getId() == id){
                return currentPerson;
            }
        }
        return new ModelPerson(0, "", "", "");
        //return null;
    }

    @Override
    public ArrayList<ModelPerson> readAll() {
        return data;
    }

    @Override
    public void update(ModelPerson modelPerson, int id) {
        for (int i= 0; i<data.size(); i++){
            ModelPerson currentPerson = data.get(i);
            if(currentPerson.getId() == id){
                currentPerson.setDni(modelPerson.getDni());
                currentPerson.setfirstName(modelPerson.getfirstName());
                currentPerson.setlastName(modelPerson.getlastName());
                break;
            }
        }
    }

    @Override
    public void deleteById(int id) {
        ModelPerson currentPerson;
        int index = -1;
        for (int i= 0; i<data.size(); i++){
            currentPerson = data.get(i);
            if(currentPerson.getId() == id){
                index = i;
            }
        }
        data.remove(index);

    }
}