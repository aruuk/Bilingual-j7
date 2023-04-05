insert into roles(id, role_name)
values (1,'ADMIN'),
       (2,'USER');

insert into users(id, email, first_name, last_name, password, role_id)
values(1,'mahamatjan@gmail.com','Mahamatjan','Islamidinov','$2a$12$7mxRz3lS2Pw9NF/jSNxOqucS/L9AupBWTRmBrpXnetnhn6BW.RVTa',1),
      (2,'argen@gmail.com','Argen','Abdymomunov', '$2a$12$MWOBRcpez1HD6XKnA3KI1OOZkZg.rNHXMS14Qen2JslsKl3EpZtVG',2),
      (3,'nuraiym@gmail.com','Nuraiym','Mamatova', '$2a$12$pM4.ujlCKRj7o7h8wIEJW.u4c3hYE77xTgIbkAOVSdBN3LBHBJGHW',2),
      (4,'aruuke@gmail.com','Aruuke','Sartbaeva', '$2a$12$jWmlL.HfSHOi2cRdZp3WEuQDecGCO0MTpAx08qmxXZzocH1B76KwK',2),
      (5,'nursultan@gmail.com','Nursultan','Zhumataev', '$2a$12$AmnfBchCicOPqY9bGmd1fuvxrX.OVc3mqduZxW/1TdO.jx1sZdvee',2),
      (6,'syimyk@gmail.com','Syimyk','Bayaliev', '$2a$12$zgjrqtYQPuwtgg7HWHoXsuvBTin9erokorric1uE2X40knxmOBiTy',2);

insert into questions(id,file,min_number_of_words,number_of_replays,passage,question_name,question_text_for_passage,question_type,score,status,time,test_id)
values (1,'string', 23, 32, 'int','task', 'string',null,23,null,'21:00',null),
       (2, 'int',54, 67, 'double', 'int','string',null, 67, null,'22:00',null),
       (3, 'string',46, 89, 'int', 'Hello, how is it going?','Write what are listening',null, 55, null,'22:00',null),
       (4, 'int',34, 45, 'double', 'int','string',null, 44, null,'22:00',null),
       (5, 'string',78, 90, 'float', 'int','double',null, 78, null,'13:00',null),
       (6, 'double',45, 54, 'byte', 'short','string',null, 54, null,'15:00',null),
       (7, 'short',23, 45, 'int', 'double','string',null, 89, null,'23:00',null),
       (8, 'byte',67, 76, 'byte', 'int','float',null, 23, null,'00:00',null),
       (9, 'float',55, 45, 'short', 'int','byte',null, 43, null,'6:00',null),
       (10, 'sting',53, 23, 'int', 'string','double',null, 56, null,'2:00',null),
       (11, 'int',68, 89, 'float', 'byte','string',null, 65, null,'12:00',null),
       (12, 'boolean',76, 56, 'double', 'int','short',null, 34, null,'4:00',null),
       (13, 'byte',23, 32, 'boolean', 'float','string',null, 23, null,'16:00',null),
       (14, 'int',12, 56, 'int', 'shot','string',null, 43, null,'6:00',null),
       (15, 'double',76, 23, 'float', 'int','double',null, 87, null,'18:00',null);


insert into options (id, is_true,option,question_id)
values (1,false,'string',1),
       (2,false,'int',2),
       (3,false,'double',3),
       (4,false,'byte', 4),
       (5,true,'string',5),
       (6,false,'float',6),
       (7,true,'int',7),
       (8,false,'integer',8),
       (9,true,'float',9),
       (10,false,'short',10);

insert into questions_options (question_id, options_id)
values (1,1),
       (2,2),
       (3,3),
       (4,4),
       (5,5),
       (6,6),
       (7,7),
       (8,8),
       (9,9),
       (10,10);

insert into questions_users (question_id, users_id)
values (1,2),
       (2,1),
       (3,3),
       (4,4),
       (5,5),
       (6,1),
       (7,2),
       (8,4),
       (9,5),
       (10,3),
       (11,1),
       (12,5),
       (13,4),
       (14,2),
       (15,1);

insert into user_question_options (id, option_id, question_id, user_id)
values (1,1,1,1),
       (2,2,2,2),
       (3,3,3,3),
       (4,4,4,4),
       (5,5,5,5),
       (6,1,1,2),
       (7,2,2,3);

insert into results (id, date_of_submission, is_read, score, status, user_name, test_id)
values (1, '2023-01-09', false, 45, null,'Mahamatjan',null);

insert into tests (id, short_description, test_name, result_id)
values (1,'string','java7',1);

insert into users_tests (user_id, test_id)
values (2,1);
