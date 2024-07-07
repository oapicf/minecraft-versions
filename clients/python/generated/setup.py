# coding: utf-8

"""
    SDK for Minecraft versions info

    The version of the OpenAPI document: 0.11.1-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from setuptools import setup, find_packages  # noqa: H301

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools
NAME = "minecraftverse"
VERSION = "0.11.1-pre.0"
PYTHON_REQUIRES = ">=3.7"
REQUIRES = [
    "urllib3 >= 1.25.3, < 2.1.0",
    "python-dateutil",
    "pydantic >= 2",
    "typing-extensions >= 4.7.1",
]

setup(
    name=NAME,
    version=VERSION,
    description="",
    author="Minecraft Versions",
    author_email="blah+oapicf@cliffano.com",
    url="https://github.com/oapicf/minecraft-versions",
    keywords=["OpenAPI", "OpenAPI-Generator", ""],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="MIT",
    long_description_content_type='text/markdown',
    long_description="""\
    SDK for Minecraft versions info
    """,  # noqa: E501
    package_data={"minecraftverse": ["py.typed"]},
)
