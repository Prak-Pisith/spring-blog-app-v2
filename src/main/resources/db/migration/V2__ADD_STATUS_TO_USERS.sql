CREATE TYPE user_status AS ENUM ('ACTIVE', 'INACTIVE');

ALTER TABLE users
ADD COLUMN status user_status;