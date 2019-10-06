drop table if exists branch;
drop table if exists account;
drop table if exists transaction;

CREATE TABLE branch(
    br_code VARCHAR(255) PRIMARY KEY,
    br_name VARCHAR(255)
);

CREATE TABLE account(
    acct_no VARCHAR(255) PRIMARY KEY,
    acct_name VARCHAR(255),
    br_code VARCHAR(255)
);

CREATE TABLE transaction(
    id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    trnsct_date VARCHAR(255),
    acct_no VARCHAR(255),
    trnsct_order int,
    amt int,
    commission int,
    cancle_yn VARCHAR(1)
);


INSERT INTO BRANCH VALUES('A','판교점');
INSERT INTO BRANCH VALUES('B','분당점');
INSERT INTO BRANCH VALUES('C','강남점');
INSERT INTO BRANCH VALUES('D','잠실점');

INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111111','제이','A');
INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111112','에이스','A');
INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111113','리노','A');
INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111114','테드','B');
INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111115','사라','B');
INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111116','린','B');
INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111117','케빈','C');
INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111118','제임스','D');
INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111119','주디','D');
INSERT INTO ACCOUNT(acct_no, acct_name, br_code) VALUES('11111120','로이','C');

INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180102','11111111',1,1000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180203','11111111',1,500000,1000,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180203','11111111',2,500000,1000,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180305','11111111',1,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180305','11111111',2,3000000,2000,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180401','11111113',1,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180401','11111113',2,3000000,1000,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180401','11111113',3,10000000,3000,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180402','11111113',1,20000000,2000,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180403','11111113',1,5000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180601','11111112',1,1000000,100,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180601','11111112',2,1000000,100,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180601','11111112',3,3000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180601','11111112',4,2000000,100,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180601','11111112',5,10000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180701','11111114',1,5000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180702','11111114',1,100000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180703','11111114',1,30000000,0,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180704','11111114',1,8000000,8000,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180705','11111114',1,50000000,5000,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180706','11111114',1,9000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180707','11111114',1,8000000,0,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180708','11111114',1,6000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180709','11111114',1,500000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180710','11111114',1,400000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180801','11111116',1,90000000,9000,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180801','11111116',2,8000000,8000,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180802','11111116',1,400000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180803','11111116',1,500000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180804','11111116',1,600000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180920','11111117',1,200000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180921','11111117',1,300000,1000,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180922','11111117',1,400000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180923','11111117',1,500000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20180924','11111117',1,600000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181010','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181011','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181012','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181013','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181014','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181101','11111119',1,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181101','11111119',2,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181101','11111119',3,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181101','11111119',4,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181101','11111119',5,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181101','11111119',6,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181101','11111119',7,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181225','11111120',1,30000000,3000,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181225','11111120',2,20000000,2000,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181225','11111120',3,9000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181231','11111120',1,8000000,400,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20181231','11111120',2,1234567,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190405','11111112',1,20000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190406','11111112',1,10000000,1000,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190407','11111112',1,300000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190408','11111112',1,5000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190409','11111112',1,6000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190501','11111111',1,100000,500,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190502','11111111',1,10000000,1800,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190503','11111111',1,10000000,0,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190503','11111111',2,20000000,0,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190503','11111111',3,1000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190601','11111113',1,1000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190602','11111113',1,700000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190602','11111113',2,70000000,7000,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190603','11111113',1,9000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190604','11111113',1,4000000,1000,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',1,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',2,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',3,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',4,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',5,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',6,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',7,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',8,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',9,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190701','11111115',10,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190805','11111116',1,700000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190806','11111116',1,800000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190807','11111116',1,900000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190808','11111116',1,10000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190809','11111116',1,3000000,300,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190924','11111117',1,700000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190924','11111117',2,800000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190924','11111117',3,900000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190924','11111117',4,1000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20190924','11111117',5,1100000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191015','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191016','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191017','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191018','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191019','11111118',1,1000000,100,'Y');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191101','11111119',1,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191101','11111119',2,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191101','11111119',3,2000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191224','11111120',1,3000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191224','11111120',2,3000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191224','11111120',3,3000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191224','11111120',4,3000000,0,'N');
INSERT INTO transaction(trnsct_date, acct_no, trnsct_order, amt, commission, cancle_yn) VALUES('20191224','11111120',5,3000000,0,'N');