public record Employee(long id, String phoneNumber, String name, int experience) {
    @Override
    public String toString() {
        return String.format("ID: %d, Phone: %s, Name: %s, Experience: %d", id, phoneNumber, name, experience);
    }
}
