package code.with.vanilson.libraryapplication.fine;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * FineDTO
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FineDTO {
    @NotNull(message = "Amount must not be null")
    @Positive(message = "Amount must be positive")
    private double amount;

    @NotNull(message = "Issue date must not be null")
    @Past(message = "Issue date must be in the past")
    private LocalDate issueDate;

    @NotNull(message = "Due date must not be null")
    @FutureOrPresent(message = "Due date must be in the future or present")
    private LocalDate dueDate;

    @NotNull(message = "Due date must not be null")
    @FutureOrPresent(message = "Due date must be in the future or present")
    private Boolean isPaid;

    // Only include IDs or relevant fields instead of full objects
    @NotNull(message = "member must not be null")
    private Long memberId;

    @NotNull(message = "Librarian must not be null")
    private Long librarianId;

    @NotNull(message = "Admin must not be null")
    private Long adminId;
}
