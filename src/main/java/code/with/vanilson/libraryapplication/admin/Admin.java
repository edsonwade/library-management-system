package code.with.vanilson.libraryapplication.admin;

import code.with.vanilson.libraryapplication.Member.Member;
import code.with.vanilson.libraryapplication.Person.Person;
import code.with.vanilson.libraryapplication.fine.Fine;
import code.with.vanilson.libraryapplication.librarian.Librarian;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * Admin
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-24
 */
@Entity
@Table(name = "admins")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "person_seq", sequenceName = "admin_id_seq", allocationSize = 1)
public class Admin extends Person {
    @Column(name = "admin_code", unique = true, nullable = false)
    private String adminCode;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "role", unique = true)
    private Role role;
    @OneToMany(mappedBy = "admin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Librarian> managedLibrarians;

    @OneToMany(mappedBy = "admin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Member> managedMembers;

    @OneToMany(mappedBy = "admin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Fine> managedFines;

}