from setuptools import setup, find_packages

#requirements = [
#]

setup(
    name="adddemo",
    version="1.0.0",
    packages=find_packages(),
    include_package_data=True,
    description='add demo',
    author='xxx',
    package_data={
        'adddemo': ['*.so']
    },
    #install_requires=requirements
)
