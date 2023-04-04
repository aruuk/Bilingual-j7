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

insert into questions(id,question_name,test_id,time,file,number_of_replays,min_number_of_words,passage,question_text_for_passage,score,status,question_type)
values (1,'string',1,'18:39','string',54,78,'int','string',20,'EVALUATED','  DESCRIBE_IMAGE');

insert into options(id,option,is_true,question_id)
values (2,null,false,1);


