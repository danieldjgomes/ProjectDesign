package com.travelReview.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Document(indexName = "review-service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    @Field(type = FieldType.Text)
    private String id;

    @Field(type = FieldType.Long)
    private Long packageId;

    @Field(type = FieldType.Long)
    private Long userId;

    @Field(type = FieldType.Integer)
    private Integer rate;

    @Field(type = FieldType.Text)
    private String text;

    @Field(type = FieldType.Nested, includeInParent = true)
    private List<Media> medias;

}
