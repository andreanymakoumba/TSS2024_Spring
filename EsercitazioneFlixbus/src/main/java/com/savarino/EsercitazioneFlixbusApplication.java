package com.savarino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.savarino.uploader.StorageProperties;

import com.savarino.uploader.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class EsercitazioneFlixbusApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsercitazioneFlixbusApplication.class, args);
	}

}
