package com.wgcode.tc_rest_api_crud_implementation.controller;

import com.wgcode.tc_rest_api_crud_implementation.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIController {

    CloudVendor cloudVendor;
    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId){
        return cloudVendor;
    }

    @PostMapping("/update")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
       this.cloudVendor = cloudVendor;
        return "Created Successfully";
    }@PutMapping("/updateById")
    public String updateCloudVendorDetailsById(@RequestBody CloudVendor cloudVendor) {
       this.cloudVendor = cloudVendor;
        return "Updated Successfully";
    }

    @DeleteMapping("/delete")
    public String DeleteCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Deleted Successfully";
    }
}
