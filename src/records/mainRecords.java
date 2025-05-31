package records;

public class mainRecords {
    public static void main(String[] args) {

        System.out.println("ejemplo DTO");
        PersonaDTO personaDTO = new PersonaDTO("daniel",40);

        System.out.println(personaDTO.getEdad());

        System.out.println("ejemplo record");
        PersonaRecord personaRecord = new PersonaRecord("yesid",35, "DEV");

        System.out.println(personaRecord.getOrganizacion());

        System.out.println(personaRecord.edad());
        System.out.println(personaRecord.nombre());
        System.out.println("ejemplo record con validacion");
        PersonaRecord personaRecordDos = new PersonaRecord("yesid",50,"DV");
        System.out.println(personaRecordDos.getOrganizacion());

    }
}
