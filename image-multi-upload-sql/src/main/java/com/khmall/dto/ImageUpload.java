package com.khmall.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ImageUpload {
	private int id;
	private String file_name;
	private String upload_dir;
}
