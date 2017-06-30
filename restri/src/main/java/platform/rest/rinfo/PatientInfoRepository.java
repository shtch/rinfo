package platform.rest.rinfo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "patient_in")
public interface PatientInfoRepository extends CrudRepository<PatientInfo, Long> {
           
//    public PatientInfo findByIsbn(@Param("isbn") String isbn);
    
//    @RestResource(path="getBooksByAuthor")
//    public List<PatientInfo> findByAuthorIgnoreCaseOrderByTitleAsc(@Param("author") String author);
    
    @Query("SELECT p FROM PatientInfo p WHERE p.show_fullname LIKE UPPER(:name)||'%' ORDER BY p.show_fullname")
    public List<PatientInfo> getByName(@Param("name") String name);
    
//    public List<PatientInfo> findByTitleContaining(@Param("title") String title); 
   
//    public int countByAuthor(@Param("author") String author);
}
