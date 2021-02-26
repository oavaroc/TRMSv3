package com.trms.models;

import java.io.File;
import java.sql.Timestamp;

public class Reimbursement {
/*
 * id serial primary key,
employee_id integer references employee(id),
date_time timestamp not null,
loc varchar not null,
description varchar not null,
event_cost numeric not null,
format_id integer references grading_format(id),
event_id integer references event_type(id),
justification varchar not null,
attatchements bytea
 */
	private Integer id;
	private Integer employeeId;
	private Timestamp date;
	private String location;
	private String description;
	private Float eventCost;
	private Integer format;
	private Integer event;
	private String justification;
	private File attatchments;
}
