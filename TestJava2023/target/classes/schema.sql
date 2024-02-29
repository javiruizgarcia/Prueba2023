CREATE TABLE IF NOT EXISTS Prices (
  id int AUTO_INCREMENT  PRIMARY KEY,
  brand_id int NOT NULL,
  start_date TIMESTAMP NOT NULL,
  end_date TIMESTAMP NOT NULL,
  price_list int NOT NULL,
  product_id int NOT NULL,
  priority int NOT NULL,
  price numeric(26,6) NOT NULL,
  curr varchar(3) NOT NULL
);

CREATE TABLE IF NOT EXISTS groups (
  brand_id int NOT NULL PRIMARY KEY,
  group_name varchar(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS products (
  product_id int NOT NULL PRIMARY KEY,
  product_name varchar(100) NOT NULL
);

ALTER TABLE Prices
    ADD FOREIGN KEY (brand_id) 
    REFERENCES groups(brand_id);
    
ALTER TABLE Prices
    ADD FOREIGN KEY (product_id) 
    REFERENCES products(product_id);