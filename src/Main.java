public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(21);
        persona.setNombre("Alexis García");
        persona.setTelefono(55556677);

        System.out.println("Tienes " + persona.getEdad() + " años de edad.");
        System.out.println("Tú nombre es: " + persona.getNombre());
        System.out.println("Tú teléfono es: " + persona.getTelefono());
    }
}

class Persona {
    private int _edad;
    private String _nombre;
    private  int _telefono;

    public void setEdad(int edad) {
        _edad = edad;
    }

    public int getEdad(){
        return _edad;
    }

    public void setNombre(String nombre){
        _nombre = nombre;
    }

    public String getNombre(){
        return _nombre;
    }

    public void setTelefono(int telefono){
        _telefono = telefono;
    }

    public int getTelefono(){
        return _telefono;
    }
}