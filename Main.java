package builder;

public class Main {
    public static void main(String[] args) {
        // Creación legible y flexible con Builder
        User user1 = new User.Builder("Juan", "Pérez")
            .age(30)
            .phone("+123456789")
            .address("Calle Falsa 123")
            .build();
        
        System.out.println(user1);
        
        // Solo nombre, apellido y teléfono - muy claro
        User user2 = new User.Builder("María", "Gómez")
            .phone("+987654321")
            .build();
            
        System.out.println(user2);
        
        // Todas las combinaciones son posibles
        User user3 = new User.Builder("Carlos", "López")
            .age(25)
            .address("Avenida Siempre Viva 742")
            .build();
            
        System.out.println(user3);
    }
}