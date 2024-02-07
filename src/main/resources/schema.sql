CREATE TABLE IF NOT EXISTS products (
    product_id SERIAL PRIMARY KEY,
    title VARCHAR(200),
    description VARCHAR(200),
    price NUMERIC(10, 2),
    discount NUMERIC(4, 2),
    discounted_price NUMERIC(10, 2)
);
