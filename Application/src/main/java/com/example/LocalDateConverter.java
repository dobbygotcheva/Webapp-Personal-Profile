package com.example;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@FacesConverter("localDateConverter")
public class LocalDateConverter implements Converter<LocalDate> {
    
    private static final DateTimeFormatter BULGARIAN_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yy");
    
    @Override
    public LocalDate getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        try {
            // First try Bulgarian format
            return LocalDate.parse(value, BULGARIAN_FORMATTER);
        } catch (DateTimeParseException e) {
            try {
                // If Bulgarian format fails, try standard format
                return LocalDate.parse(value);
            } catch (DateTimeParseException ex) {
                throw new IllegalArgumentException("Invalid date format. Please use DD.MM.YY or YYYY-MM-DD format.");
            }
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, LocalDate value) {
        if (value == null) {
            return "";
        }
        return value.format(BULGARIAN_FORMATTER);
    }
} 