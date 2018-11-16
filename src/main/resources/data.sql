-- 카테고리 추가
INSERT INTO category (id, name, parent_id, ordering)
VALUES (1, '호밀빵', 0, 1);

INSERT INTO category (id, name, parent_id, ordering)
VALUES (2, '통밀빵', 0, 2);

-- 상품 추가
INSERT INTO product (id, cutting, name, nutrient, point, price, reg_date, stock, category_id)
VALUES (1, true, '65% 호두 호밀빵', '호밀, 이스트, 버터', 50, 10000, now(), 40, 1);

INSERT INTO product (id, cutting, name, nutrient, point, price, reg_date, stock, category_id)
VALUES (2, false, '100% 검은콩 통밀 베이글', '개당 약80g 8개 한세트1개당 열량 : 174kcal', 25, 5000, now(), 40, 2);

INSERT INTO product (id, cutting, name, nutrient, point, price, reg_date, stock, category_id)
VALUES (3, true, '35% 호두 호밀빵', '호밀, 이스트, 버터', 30, 8000, now(), 40, 1);

INSERT INTO product (id, cutting, name, nutrient, point, price, reg_date, stock, category_id)
VALUES (4, true, '65% 자연발효 호밀빵', '호밀, 이스트, 버터', 30, 8000, now(), 40, 1);

INSERT INTO product (id, cutting, name, nutrient, point, price, reg_date, stock, category_id)
VALUES (4, true, '65% 자연발효 호밀빵', '호밀, 이스트, 버터', 30, 8000, now(), 40, 1);

INSERT INTO product (id, cutting, name, nutrient, point, price, reg_date, stock, category_id)
VALUES (4, true, '65% 자연발효 호밀빵', '호밀, 이스트, 버터', 30, 8000, now(), 40, 1);





