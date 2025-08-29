package com.example.Full.Stack.Project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponsePayload {
    @JsonProperty("is_success")
    private boolean isSuccess;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("roll_number")
    private String rollNumber;

    @JsonProperty("odd_numbers")
    private List<String> oddNumbers;

    @JsonProperty("even_numbers")
    private List<String> evenNumbers;

    @JsonProperty("alphabets")
    private List<String> alphabets;

    // Note: The example response has a typo "sepcial_characters", but we will use the correct name from the objective.
    @JsonProperty("special_characters")
    private List<String> specialCharacters;

    private String sum;

    @JsonProperty("concat_string")
    private String concatString;

    // Getters and Setters
    public boolean isSuccess() { return isSuccess; }
    public void setSuccess(boolean success) { isSuccess = success; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }
    public List<String> getOddNumbers() { return oddNumbers; }
    public void setOddNumbers(List<String> oddNumbers) { this.oddNumbers = oddNumbers; }
    public List<String> getEvenNumbers() { return evenNumbers; }
    public void setEvenNumbers(List<String> evenNumbers) { this.evenNumbers = evenNumbers; }
    public List<String> getAlphabets() { return alphabets; }
    public void setAlphabets(List<String> alphabets) { this.alphabets = alphabets; }
    public List<String> getSpecialCharacters() { return specialCharacters; }
    public void setSpecialCharacters(List<String> specialCharacters) { this.specialCharacters = specialCharacters; }
    public String getSum() { return sum; }
    public void setSum(String sum) { this.sum = sum; }
    public String getConcatString() { return concatString; }
    public void setConcatString(String concatString) { this.concatString = concatString; }
}
