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
values (1,'string', 23, 32, 'int','task', 'string',null,23,null,'21:00',null);

insert into options (id, is_true,option,question_id)
values (1,false,'string',1);

insert into questions_options (question_id, options_id)
values (1,1);

insert into questions_users (question_id, users_id)
values (1,2);

insert into user_question_options (id, option_id, question_id, user_id)
values (1,1,1,1);

insert into results (id, date_of_submition, is_read, score, status, user_name, test_id)
values (1, '2023-01-09', false, 45, null,'Mahamatjan',null);

insert into tests (id, short_description, test_name, result_id)
values (1,'string','java7',1);

insert into users_tests (user_id, test_id)
values (2,1);
