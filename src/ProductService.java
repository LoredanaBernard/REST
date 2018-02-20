import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/RestServer")
public class ProductService {

	@GET
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDescriptionProduct( @PathParam("id") int id ) {
		return tableProductManager.descriptionProduit(id);
		
		// Retourner au format JSOn 
    }    
	
	@GET
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getDescriptionProduct( @PathParam("id") int id, @PathParam("name") String name, @PathParam("description") String description, @PathParam("stock") int stock ) {
        Product prod = new Product(id, name, description, stock);
        return prod;
    }    
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product postProduct(Product prod) {
        return prod;
    }
	
	
}
