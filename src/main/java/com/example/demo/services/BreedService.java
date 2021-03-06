package com.example.demo.services;

import com.example.demo.dto.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class BreedService {

    @Value("classpath:${MOCK_DATA_FILE}")
    Resource resourceFile;

    private String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line);//.append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    public Result list() throws Exception {
        InputStream inp = new FileInputStream(resourceFile.getFile());
        return new Result(readFromInputStream(inp));
    }
}
