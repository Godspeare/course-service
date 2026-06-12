package com.aptech.courseservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @PostMapping("/student/{studentId}/course/{courseId}")
    public ResponseEntity<String> enrollStudent(@PathVariable Long studentId, @PathVariable Long courseId) {
        try {
            // Task 2: Simulating Feign client error scenarios safely
            if (studentId == 999) {
                throw new IllegalArgumentException("404");
            } else if (studentId == 0) {
                throw new IllegalStateException("503");
            }
            return ResponseEntity.ok("Successfully enrolled student with ID " + studentId + " in course " + courseId + "!");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Error: No student exists with ID " + studentId + ".");
        } catch (IllegalStateException e) {
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                    .body("Error: Student Service is currently offline. Please try again later.");
        }
    }
}