package com.trms.models;

public class Message {
/*
 * id serial primary key,
m_from integer references employee(id),
m_to integer references employee(id),
m_content varchar
 */
	private Integer id;
	private Integer from;
	private Integer to;
	private String content;
}
