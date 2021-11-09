package net.josephworks.http;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UrlFetchAppTest {
    UrlFetchApp urlFetchApp;

    @BeforeEach
    void setUp() {
        urlFetchApp = new UrlFetchApp();
    }

    @Test
    @DisplayName("Getting google should work")
    void testFetch() {
        urlFetchApp.fetch("https://google.com");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fetch() {
    }
}
