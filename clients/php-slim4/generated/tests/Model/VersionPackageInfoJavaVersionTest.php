<?php

/**
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * SDK for Minecraft versions info
 * The version of the OpenAPI document: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\VersionPackageInfoJavaVersion;

/**
 * VersionPackageInfoJavaVersionTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\VersionPackageInfoJavaVersion
 */
class VersionPackageInfoJavaVersionTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
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
     * Test "VersionPackageInfoJavaVersion"
     */
    public function testVersionPackageInfoJavaVersion()
    {
        $testVersionPackageInfoJavaVersion = new VersionPackageInfoJavaVersion();
        $namespacedClassname = VersionPackageInfoJavaVersion::getModelsNamespace() . '\\VersionPackageInfoJavaVersion';
        $this->assertSame('\\' . VersionPackageInfoJavaVersion::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "VersionPackageInfoJavaVersion" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "component"
     */
    public function testPropertyComponent()
    {
        self::markTestIncomplete(
            'Test of "component" property in "VersionPackageInfoJavaVersion" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "majorVersion"
     */
    public function testPropertyMajorVersion()
    {
        self::markTestIncomplete(
            'Test of "majorVersion" property in "VersionPackageInfoJavaVersion" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = VersionPackageInfoJavaVersion::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

