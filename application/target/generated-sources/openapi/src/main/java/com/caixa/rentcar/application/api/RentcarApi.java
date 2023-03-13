/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.caixa.rentcar.application.api;

import com.caixa.rentcar.application.model.ApiRentCarOrderDetailDto;
import com.caixa.rentcar.application.model.ApiRentCarOrderDto;
import com.caixa.rentcar.application.model.ApiResponseDto;
import java.util.List;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-13T09:45:32.834281+01:00[Europe/Madrid]")
@Validated
@Api(value = "rentcar", description = "the rentcar API")
public interface RentcarApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /rentcar/return : complete a rent car order
     *
     * @param carPlate Identification car (required)
     * @param returnDate Identification car (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "complete a rent car order", nickname = "completeRentCarOrder", notes = "", response = ApiResponseDto.class, tags={ "rentcar", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApiResponseDto.class) })
    @PostMapping(
        value = "/rentcar/return",
        produces = { "application/json" }
    )
    default ResponseEntity<ApiResponseDto> _completeRentCarOrder(@NotNull @ApiParam(value = "Identification car", required = true) @Valid @RequestParam(value = "car_plate", required = true) String carPlate,@NotNull @ApiParam(value = "Identification car", required = true) @Valid @RequestParam(value = "return_date", required = true) String returnDate) {
        return completeRentCarOrder(carPlate, returnDate);
    }

    // Override this method
    default  ResponseEntity<ApiResponseDto> completeRentCarOrder(String carPlate, String returnDate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"orders\" : [ { \"end_date\" : \"end_date\", \"client_dni\" : \"client_dni\", \"car_plate\" : \"car_plate\", \"created_on\" : \"created_on\", \"price\" : 1.4658129805029452, \"id\" : 6, \"start_date\" : \"start_date\", \"return_date\" : \"return_date\", \"status\" : \"status\" }, { \"end_date\" : \"end_date\", \"client_dni\" : \"client_dni\", \"car_plate\" : \"car_plate\", \"created_on\" : \"created_on\", \"price\" : 1.4658129805029452, \"id\" : 6, \"start_date\" : \"start_date\", \"return_date\" : \"return_date\", \"status\" : \"status\" } ], \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /rentcar : create a new rent car order
     *
     * @param body Created rent car object (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "create a new rent car order", nickname = "createRentCarOrder", notes = "", response = ApiResponseDto.class, tags={ "rentcar", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApiResponseDto.class) })
    @PostMapping(
        value = "/rentcar",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ApiResponseDto> _createRentCarOrder(@ApiParam(value = "Created rent car object" ,required=true )  @Valid @RequestBody List<ApiRentCarOrderDto> body) {
        return createRentCarOrder(body);
    }

    // Override this method
    default  ResponseEntity<ApiResponseDto> createRentCarOrder(List<ApiRentCarOrderDto> body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"orders\" : [ { \"end_date\" : \"end_date\", \"client_dni\" : \"client_dni\", \"car_plate\" : \"car_plate\", \"created_on\" : \"created_on\", \"price\" : 1.4658129805029452, \"id\" : 6, \"start_date\" : \"start_date\", \"return_date\" : \"return_date\", \"status\" : \"status\" }, { \"end_date\" : \"end_date\", \"client_dni\" : \"client_dni\", \"car_plate\" : \"car_plate\", \"created_on\" : \"created_on\", \"price\" : 1.4658129805029452, \"id\" : 6, \"start_date\" : \"start_date\", \"return_date\" : \"return_date\", \"status\" : \"status\" } ], \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /rentcar/{rentcar_id} : Finds Rent Car Order
     * Finds Rent Car Order Details from database
     *
     * @param rentcarId DNI of client that needs to be retrieved (required)
     * @return successful operation (status code 200)
     *         or Rent Car Id invalid value (status code 400)
     *         or Rent Car Id not found (status code 404)
     */
    @ApiOperation(value = "Finds Rent Car Order", nickname = "findRentCarOrder", notes = "Finds Rent Car Order Details from database", response = ApiRentCarOrderDetailDto.class, tags={ "rentcar", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApiRentCarOrderDetailDto.class),
        @ApiResponse(code = 400, message = "Rent Car Id invalid value"),
        @ApiResponse(code = 404, message = "Rent Car Id not found") })
    @GetMapping(
        value = "/rentcar/{rentcar_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<ApiRentCarOrderDetailDto> _findRentCarOrder(@ApiParam(value = "DNI of client that needs to be retrieved",required=true) @PathVariable("rentcar_id") String rentcarId) {
        return findRentCarOrder(rentcarId);
    }

    // Override this method
    default  ResponseEntity<ApiRentCarOrderDetailDto> findRentCarOrder(String rentcarId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"end_date\" : \"end_date\", \"client_dni\" : \"client_dni\", \"car_plate\" : \"car_plate\", \"car_detail\" : \"car_detail\", \"id\" : 0, \"client_fullname\" : \"client_fullname\", \"start_date\" : \"start_date\", \"return_date\" : \"return_date\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
