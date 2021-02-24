import data.Database;
import data.interfaces.IDatabase;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import repositories.MedicineRepository;
import repositories.interfaces.IMedicineRrepository;

public class MyApplicationBinder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(Database.class).to(IDatabase.class);
        bind(MedicineRepository.class).to(IMedicineRrepository.class);
    }
}
