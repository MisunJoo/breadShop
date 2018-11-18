-- 카테고리 추가
INSERT INTO category (id, name, parent_id, ordering)
VALUES (1, '호밀빵', 0, 1);

INSERT INTO category (id, name, parent_id, ordering)
VALUES (2, '통밀빵', 0, 2);

INSERT INTO category (id, name, parent_id, ordering)
VALUES (3, '밀빵', 0, 3);


-- 상품 추가 (호밀빵)
INSERT INTO product (id, cutting, deleted, detail, hit, name, nutrition, point, price, reg_date, stock, update_date, category_id)
VALUES (1, false, false, '트랜스지방 제로, 저칼로리(저GI)', 0, '65% 호두 호밀빵', '중량 : 약260g 100g당 열량 : 222kcal', 50, 6400, now(), 20, now(), 1);

INSERT INTO product (id, cutting, deleted, detail, hit, name, nutrition, point, price, reg_date, stock, update_date, category_id)
VALUES (2, false, false, '트랜스지방 제로, 저칼로리(저GI)', 0, '35% 호두 호밀빵', '중량 : 약260g 100g당 열량 : 222kcal', 50, 6400, now(), 20, now(), 1);

INSERT INTO product (id, cutting, deleted, detail, hit, name, nutrition, point, price, reg_date, stock, update_date, category_id)
VALUES (3, false, false, '트랜스지방 제로, 저칼로리(저GI)', 0, '65% 자연발효 호밀빵', '중량 : 약480g 100g당 열량 : 209kcal', 50, 9200, now(), 20, now(), 1);


-- 상품 추가 (통밀빵)
INSERT INTO product (id, cutting, deleted, detail, hit, name, nutrition, point, price, reg_date, stock, update_date, category_id)
VALUES (4, false, false, '트랜스지방 제로, 저칼로리(저GI)', 0, '100% 검은콩 통밀 베이글 (8개 한세트)', '중량 : 1개당 약80g 8개 한세트 1개당 열량 : 174kcal', 50, 13500, now(), 20, now(), 2);

INSERT INTO product (id, cutting, deleted, detail, hit, name, nutrition, point, price, reg_date, stock, update_date, category_id)
VALUES (5, false, false, '트랜스지방 제로, 저칼로리(저GI)', 0, '35% 무화과 통밀빵', '중량 : 약300g 100g당 열량 : 218kcal', 50, 6200, now(), 20, now(), 2);

INSERT INTO product (id, cutting, deleted, detail, hit, name, nutrition, point, price, reg_date, stock, update_date, category_id)
VALUES (6, false, false, '트랜스지방 제로, 저칼로리(저GI)', 0, '35% 치즈 통밀빵', '중량 : 약300g 100g당 열량 : 230kcal', 50, 6200, now(), 20, now(), 2);


-- 상품 추가 (밀빵)
INSERT INTO product (id, cutting, deleted, detail, hit, name, nutrition, point, price, reg_date, stock, update_date, category_id)
VALUES (7, false, false, '트랜스지방 제로, 저칼로리(저GI)', 0, '크랜베리 스콘', '중량 : 약70g 100g당 열량 : 260kcal', 50, 2900, now(), 20, now(), 3);

INSERT INTO product (id, cutting, deleted, detail, hit, name, nutrition, point, price, reg_date, stock, update_date, category_id)
VALUES (8, false, false, '트랜스지방 제로, 저칼로리(저GI)', 0, '시나몬 식빵', '중량 : 약490g 100g당 열량 : 236kcal', 50, 6200, now(), 20, now(), 3);

INSERT INTO product (id, cutting, deleted, detail, hit, name, nutrition, point, price, reg_date, stock, update_date, category_id)
VALUES (9, false, false, '트랜스지방 제로, 저칼로리(저GI)', 0, '생크림 스콘', '중량 : 약70g 100g당 열량 : 273kcal', 50, 2600, now(), 20, now(), 3);


--멤버 추가
INSERT INTO member (id, address, address_detail, email, gender, member_id, name, password, phone, point, receive_email, receive_sms, zipcode)
VALUES (1, '관리자 주소', '관리자 상세 주소', 'webmaster@naver.com', '없음', 'webmaster', 'admin', '1234', '01011111111', 0, false, false, '123-45');

INSERT INTO member (id, address, address_detail, email, gender, member_id, name, password, phone, point, receive_email, receive_sms, zipcode)
VALUES (2, '한국', '비밀임', '0987someday@naver.com', '여성', '0987someday', '주미선', '1234', '01022222222', 0, true, true, '234-56');

INSERT INTO member (id, address, address_detail, email, gender, member_id, name, password, phone, point, receive_email, receive_sms, zipcode)
VALUES (3, '한국', '부산광역시', 'number3@naver.com', '남성', 'ibusanyou', '홍길동', '1234', '01033333333', 0, true, true, '345-67');


--쿠폰 추가
INSERT INTO coupon (id, expire_date, name, rate, total_num)
VALUES (1, '2018-12-31 23:59:59', '연말 할인 쿠폰', '5', 10 );

INSERT INTO coupon (id, expire_date, name, rate, total_num)
VALUES (2, '2018-12-31 23:59:59', '신규고객 할인 쿠폰', '10', 10 );


-- 상품 옵션 추가
INSERT INTO product_option (id, add_price, type, product_id)
VALUES (1, 2000, '더 고소한 65% 호두 호밀빵', 1);

INSERT INTO product_option (id, add_price, type, product_id)
VALUES (2, 4000, '90% 무화과 통밀빵', 5);


--구매 기록 추가
INSERT INTO purchase_record (id, member_id)
VALUES (1, 2);

INSERT INTO purchase_record (id, member_id)
VALUES (2, 3);

--구매 상품 추가
INSERT INTO purchase_product (id, origin_price, refund_check, product_id, purchase_record_id)
VALUES (1, 6400, false, 1, 1);

INSERT INTO purchase_product (id, origin_price, refund_check, product_id, purchase_record_id)
VALUES (2, 13500, false, 4, 1);

INSERT INTO purchase_product (id, origin_price, refund_check, product_id, purchase_record_id)
VALUES (3, 2900, false, 7, 2);

INSERT INTO purchase_product (id, origin_price, refund_check, product_id, purchase_record_id)
VALUES (4, 6200, false, 8, 2);


--지불 추가
INSERT INTO payment (id, deposit, pay_by, pay_date, price, purchase_record_id)
VALUES (1, true, '신용카드', now(), 19900, 1);

INSERT INTO payment (id, deposit, pay_by, pay_date, price, purchase_record_id)
VALUES (2, false, '무통장입금', NULL, 8100, 2);


--배송 추가
INSERT INTO shipping (id, company, invoice, receive_address, receive_date, receive_name, receive_phone, status, purchase_record_id)
VALUES (1, '우체국택배', '1234-5678', '서울', now(), '주미선', '01022222222', '배송완료', 1);

INSERT INTO shipping (id, company, invoice, receive_address, receive_date, receive_name, receive_phone, status, purchase_record_id)
VALUES (2, '우체국택배', '2345-6789', '부산', now(), '홍길동', '01033333333', '배송중', 2);


--환불 추가
INSERT INTO refund (id, reason, refund_check, refund_date, purchase_product_id, origin_price)
VALUES (1, '사이즈안맞음', true, '2018-12-30 23:14:03', 2, 13500);