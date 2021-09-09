DROP TABLE IF EXISTS price;
DROP TABLE IF EXISTS brand;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS price_rate;

CREATE TABLE brand (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE product (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE price_rate (
  id int(11) NOT NULL AUTO_INCREMENT,
  description varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE price (
  id int(11) NOT NULL AUTO_INCREMENT,
  brand_id int(11) NOT NULL,
  start_date timestamp NOT NULL,
  end_date timestamp NOT NULL,
  price_rate_id int(11) NOT NULL,
  product_id int(11) NOT NULL,
  priority int(2) NOT NULL,
  price float,
  curr varchar(50),
  PRIMARY KEY (`id`),
  CONSTRAINT `price_brand_FK` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`id`),
  CONSTRAINT `price_price_rate_FK` FOREIGN KEY (`price_rate_id`) REFERENCES `price_rate` (`id`),
  CONSTRAINT `price_product_FK` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
);