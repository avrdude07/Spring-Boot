package com.example.api;

import com.example.api.dto.CategoryData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoryDataTest {
    private CategoryData categoryData = new CategoryData();

    @Test
    public void testNotEmpty(){
        assertNotNull("Name is required");
    }
}
