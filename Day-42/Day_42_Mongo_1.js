/* 
Wrrite a MongoDB Query to display all documents from the inventory collection, 
where the status equals "A" and either qty is less than 30 or item starts with
the letter p.
.
Sample Document:
----------------
{ 
	"item": "journal", 
	"qty": 25, 
	"size": { "h": 14, "w": 21, "uom": "cm" }, 
	"status": "A" 
}


Note: To write the query, use printjson() method from 'mongosh' module
    e.g., To display all the douments from 'students' collection
        => printjson( db.inventory.find())
    Where,
    db => databse connection object
    inventory => collections name
    find => method to retrieve  all the docuemnts

*/

// Write the query here.

printjson(db.inventory.find({status:"A",$or:[{qty:{$lt:30}},{item:{$regex:/^p/}}]}));