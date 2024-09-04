package code.with.vanilson.libraryapplication.librarian;

import code.with.vanilson.libraryapplication.Member.Member;
import code.with.vanilson.libraryapplication.Person.Address;
import code.with.vanilson.libraryapplication.Person.Person;
import code.with.vanilson.libraryapplication.admin.Admin;
import code.with.vanilson.libraryapplication.book.Book;
import code.with.vanilson.libraryapplication.fine.Fine;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

/**
 * Librarian
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-24
 */
@Entity(name = "Librarian")
@Table(name = "librarians")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Librarian extends Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "employee_code", unique = true, nullable = false)
    private String employeeCode;

    @OneToMany(mappedBy = "librarian")
    @JsonIgnore
    private Set<Book> managedBooks;

    @OneToMany(mappedBy = "librarian")
    @JsonIgnore
    private Set<Member> members;

    @OneToMany(mappedBy = "librarian")
    @JsonIgnore
    private Set<Fine> fines;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    @JsonIgnore
    private Admin admin;

    public Librarian(String name, String email, Address address, String contact, String employeeCode) {
        super(name, email, address, contact);
        this.employeeCode = employeeCode;
    }

    public Librarian(String name, String email, Address address, String contact, String employeeCode, Admin admin) {
        super(name, email, address, contact);
        this.employeeCode = employeeCode;
        this.admin = admin;
    }
}
