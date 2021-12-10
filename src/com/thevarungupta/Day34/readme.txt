# Spring Data

# What is Spring Data
# Connect Spring Boot App with DB
# Mapping Entities with DB
# Different JPA Annotation
# Repositories and their methods
# @Embeddable and @Embedded
# Creating JPA repositires and method
# @Query Annotation
# Native Queries
# Query Named Params
# @Transactional
# Relationship
# One to One
# One to Many
# Cascade Type
# Fetch Type


# Spring Data
It is a high level SpringSourec Project whose purpose is to unify and ease the access to different kind of persistence store
bth relational database system and NoSQL data stores


https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFirstName(String firstName);
    List<Student> findFirstNameContaining(String firstName);
    List<Student> findByLastNameNotNull();
    List<Student> findByGuardianName(String guradianName);
    Student findByFirstNameAndLastName(String firstName, String lastName);

    // JPQL
    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentByEmailAddress(String emailId);

    // JPQL
    @Query("select s.firstName from Student s where s.emailId = ?1")
    String getStudentFirstNameByEmailAddress(String emailId);

    // native
    @Query(
            value = "select * from tbl_student s where s.email_address  = ?1",
            nativeQuery = true
    )
    Student getStudnetByEmailNative(String firstName);

    //native names params
    @Query(
            value = "select * from tbl_student s where s.email_address  = :emailId",
            nativeQuery = true
    )
    Student getStudentByEmailNativeParam(
            @Param("emailId") String emailId);
}
