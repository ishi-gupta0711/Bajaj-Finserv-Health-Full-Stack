package com.example.Full.Stack.Project.controller;

import com.example.Full.Stack.Project.dto.RequestPayload;
import com.example.Full.Stack.Project.dto.ResponsePayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bfhl")
public class ApiController {
    @PostMapping
    public ResponseEntity<ResponsePayload> processData(@RequestBody RequestPayload request) {
        ResponsePayload response = new ResponsePayload();
        try {
            List<String> oddNumbers = new ArrayList<>();
            List<String> evenNumbers = new ArrayList<>();
            List<String> alphabets = new ArrayList<>();
            List<String> specialChars = new ArrayList<>();
            double sum = 0;
            StringBuilder alphabetCollector = new StringBuilder();

            for (String item : request.getData()) {

                try {
                    double num = Double.parseDouble(item);
                    sum += num;
                    if (num % 2 == 0) {
                        evenNumbers.add(item);
                    } else {
                        oddNumbers.add(item);
                    }
                } catch (NumberFormatException e) {

                    if (item.matches("[a-zA-Z]+")) {
                        alphabets.add(item.toUpperCase());
                    } else {
                        specialChars.add(item);
                    }

                    for (char c : item.toCharArray()) {
                        if (Character.isLetter(c)) {
                            alphabetCollector.append(c);
                        }
                    }
                }
            }

            String reversedAlphabets = alphabetCollector.reverse().toString();
            StringBuilder alternatingCaps = new StringBuilder();
            for (int i = 0; i < reversedAlphabets.length(); i++) {
                char c = reversedAlphabets.charAt(i);
                alternatingCaps.append(i % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }


            response.setSuccess(true);
            response.setUserId("ishika_gupta_22BCE8883");
            response.setEmail("ishika.22bce8883@vitapstudent.ac.in");
            response.setRollNumber("22BCE8883");
            response.setOddNumbers(oddNumbers);
            response.setEvenNumbers(evenNumbers);
            response.setAlphabets(alphabets);
            response.setSpecialCharacters(specialChars);
            response.setSum(String.valueOf(sum));
            response.setConcatString(alternatingCaps.toString());

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            response.setSuccess(false);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
