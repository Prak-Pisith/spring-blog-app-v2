-- Step 1: Create a new column with the desired string type
ALTER TABLE users
ADD COLUMN status_new VARCHAR(20);

-- Step 2: Update the new column with values from the old enum column
UPDATE users
SET status_new = status::text;

-- Step 3: Drop the old enum column
ALTER TABLE users
DROP COLUMN status;

-- Step 4: Rename the new column to match the old column name if needed
ALTER TABLE users
RENAME COLUMN status_new TO status;
