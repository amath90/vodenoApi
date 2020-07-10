package Test;

import Pets.AddPet;
import Pets.GetPet;
import Pets.RemovePet;
import Pets.petbody.PetBodyPreparator;
import org.junit.Test;

public class TestPets extends BaseTest {

    private final PetBodyPreparator petBodyPreparator = new PetBodyPreparator();
    private final String petName = "krasula";
    private final Integer petCategoryId = 666;
    private final String petCategoryName = "cow";
    private final String petTagName = "milk";
    private final Integer petTagId = 555;


    @Test
    public void getPreviouslyAddPet() {
        final Long newPetId = addNewPet();
        GetPet.perform(newPetId);
        LOG.info("Getting pet with id: " + newPetId);
    }

    @Test
    public void removePreviouslyAddPet() {
        final Long newPetId = addNewPet();
        RemovePet.removePet(addNewPet());
        LOG.info("Removing pet with id: " + newPetId);
    }

    @Test
    public void addNewPetWithSpecifiedValues() {
        LOG.info("Adding new pet with specified values which id is: ");
    }

    @Test
    public void confirmDataForPetWithSpecifiedValues() {
        LOG.info("Checking data of pet with specified values");
    }

    @Test
    public void gettingPetWithSpecifiedStatus() {
        LOG.info("Getting pet with specified status");
    }


    private Long addNewPet(){
        final Long newPetID = AddPet.perform(petBodyPreparator.prepare(petCategoryId, petCategoryName, petName, petTagId, petTagName));
        LOG.info("Adding new pet without specified values which id is: " + newPetID );
        return newPetID;
    }


}
