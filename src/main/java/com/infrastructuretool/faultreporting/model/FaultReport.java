package com.infrastructuretool.faultreporting.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "fault_reports")
@Builder
public class FaultReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;

    private double latitude;
    private double longitude;

    private String photoUrl;

    @Enumerated(EnumType.STRING)
    private FaultStatus status = FaultStatus.PENDING;

    @ManyToOne
    private User reportedBy;

    private LocalDateTime reportedAt;
}
