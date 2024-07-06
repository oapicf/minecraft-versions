<?php
/**
 * V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionTest Class Doc Comment
 *
 * @category    Class
 * @description V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
 */
class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionTest extends TestCase
{
    protected V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion::class)->getMockForAbstractClass();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion::class));
        $this->assertInstanceOf(V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion::class, $this->object);
    }

    /**
     * Test attribute "component"
     *
     * @group unit
     * @small
     */
    public function testPropertyComponent(): void
    {
        $this->markTestSkipped('Test for property component not implemented');
    }

    /**
     * Test attribute "majorVersion"
     *
     * @group unit
     * @small
     */
    public function testPropertyMajorVersion(): void
    {
        $this->markTestSkipped('Test for property majorVersion not implemented');
    }
}
